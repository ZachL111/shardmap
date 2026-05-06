# Review Journal

The review surface for `shardmap` is deliberately narrow: one fixture, one scoring rule, and one local check.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its distributed systems focus without claiming live deployment or external usage.

## Cases

- `baseline`: `quorum health`, score 178, lane `ship`
- `stress`: `lease drift`, score 157, lane `ship`
- `edge`: `replica lag`, score 212, lane `ship`
- `recovery`: `membership churn`, score 227, lane `ship`
- `stale`: `quorum health`, score 216, lane `ship`

## Note

The repository should be understandable without pretending it is larger than it is.
