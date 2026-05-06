# Shardmap Walkthrough

This walk-through keeps the domain vocabulary close to the data instead of burying it in prose.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | quorum health | 178 | ship |
| stress | lease drift | 157 | ship |
| edge | replica lag | 212 | ship |
| recovery | membership churn | 227 | ship |
| stale | quorum health | 216 | ship |

Start with `recovery` and `stress`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

The useful comparison is `membership churn` against `lease drift`, not the raw score alone.
