# shardmap

`shardmap` treats distributed systems as a local verification problem. The Scala implementation is intentionally narrow, but the fixtures and notes make the behavior explicit.

## Shardmap Checkpoints

Treat the compact fixture as the contract and the extended examples as a scratchpad. The code should stay boring enough that a change in behavior is obvious from the test output.

## What This Is For

The repository exists to keep a technical idea small enough to reason about. The implementation avoids external dependencies where possible, then uses fixtures to make changes easy to review.

## Useful Pieces

- Models node state with deterministic scoring and explicit review decisions.
- Uses fixture data to keep quorum behavior changes visible in code review.
- Includes extended examples for lease timing, including `surge` and `degraded`.
- Documents message ordering tradeoffs in `docs/operations.md`.
- Runs locally with a single verification command and no external credentials.

## Architecture Notes

The design is intentionally direct: parse or construct a signal, score it, classify it, and verify the expected branch. This makes the repository useful for studying distributed systems behavior without needing a service or database unless the language project itself is SQL. The Scala code uses case classes and a compact object API to keep the test path direct.

## Project Layout

- `src`: primary implementation
- `tests`: verification harness
- `fixtures`: compact golden scenarios
- `examples`: expanded scenario set
- `metadata`: project constants and verification metadata
- `docs`: operations and extension notes
- `scripts`: local verification and audit commands

## Tooling

Use a normal shell with Scala available on `PATH`. The verifier is written as a PowerShell script because the portfolio was assembled on Windows.

## Local Workflow

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

This runs the language-level build or test path against the compact fixture set.

## Quality Gate

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/audit.ps1
```

The audit command checks repository structure and README constraints before it delegates to the verifier.

## Case Study

The extended cases are not random smoke tests. `degraded` keeps pressure on the review path, while `surge` shows the model when capacity and weight are strong enough to clear the threshold.

## Scope

The examples cover useful edges, not every edge. A larger version would add malformed-input tests, richer reports, and deeper domain parsers.

## Expansion Ideas

- Add a short report command that prints the score breakdown for a single scenario.
- Add malformed input fixtures so the failure path is as visible as the happy path.
- Split the scoring constants into a typed configuration object and validate it before use.
- Add one more distributed systems fixture that focuses on a malformed or borderline input.
