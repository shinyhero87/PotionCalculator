# PotionCalculator

Java coursework by Blake Lacroix at Tacoma Community College. Calculates ingredient packages and purchasing costs for batches of health and mana potions using unit conversions and rounding up to whole packages.

## Try it

Use JDK 21. The original class provides static methods rather than a main method. From this folder, start JShell:

```powershell
jshell
```

Then enter:

```java
/open PotionCalculator.java
PotionCalculator.bagsOfMushroomPowder(12, 8)
PotionCalculator.totalCost(12, 8)
/exit
```

Alternatively, compile the class for use in another Java program:

```powershell
javac -d bin PotionCalculator.java
```

## Verification and scope

The supplied course tester passed all ingredient-method checks locally. It does not test totalCost. The instructor-provided tester is excluded because its header restricts use to students in a specific TCC course. Original implementation is unchanged. Inputs are assumed to be nonnegative potion counts; this learning project does not add input validation.
