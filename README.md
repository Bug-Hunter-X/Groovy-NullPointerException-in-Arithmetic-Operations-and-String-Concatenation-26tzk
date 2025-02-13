# Groovy NullPointerException Handling

This repository demonstrates a common issue in Groovy: unexpected NullPointerExceptions when arithmetic operations or string concatenation are performed without explicit null checks.  Groovy's dynamic typing can mask the absence of null handling, leading to runtime errors.

The `bug.groovy` file showcases the problem; `bugSolution.groovy` offers a corrected version with improved null handling.

## Reproducing the Bug

1. Clone this repository.
2. Run `bug.groovy` using a Groovy interpreter.
3. Observe the unexpected `NullPointerException` when both input parameters are null. 

## Solution

The solution involves implementing explicit null checks before attempting any operations with the potentially null values.  This ensures that the method handles null values gracefully, avoiding exceptions and providing predictable behavior.