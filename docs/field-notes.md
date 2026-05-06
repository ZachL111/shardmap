# Field Notes

This note keeps the distributed systems assumptions visible beside the checks.

The domain cases cover `quorum health`, `lease drift`, `replica lag`, and `membership churn`. They sit beside the smaller starter fixture so the project has both a compact scoring check and a domain-flavored review check.

`recovery` is the strongest case at 227 on `membership churn`. `stress` is the cautious anchor at 157 on `lease drift`.

The language-specific addition keeps the review model in case classes and a runner check.
