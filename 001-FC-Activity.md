# Flow Control Activities
## Scope
The goal of the activities listed below is to give associates experience working with basic control flow statements. The activities listed below range in difficulty from minimal to medium difficulty since control flow is generally one of the earliest topics covered in most curricula, as such, a trainer may peruse these activities to decide which is the most applicable for the batch.

## Legend For Activity Guide

- :white_check_mark: - Tested successfully with a live batch
- :warning: - Tested with live batch with minor bugs/alterations
- :x: - Never tested with a live batch


##  :x: Simple grading calculator
Given two double values, earnedPoints and totalPoints, calculate and display the letter grade for an assignment
 
Estimated time: 15 minutes

Associate facing instructions:
```
Today, we'll practice simple flow control with a method that prints out a letter grade based off the points earned on an assignment

Construct a method called gradeAssignment that takes in two doubles, earnedPoints and totalPoints and returns void.

Using these two values, calculate the percentage of points earned on the assignment.

Utilize this percentage value to calculate the letter grade for the assignment

<60.0% -> F
60.0 - 69.9% -> D 
70.0 - 79.9% -> C 
80.0 - 89.9% -> B
>= 90.0 -> A

Print the letter grade earned to the console

Ex: 

Input:
    earnedPoints = 5
    totalPoints = 7
Output:
    C

5/7 -> .714 or 71.4%

71.4% is between 70.0% and 79.9% thus, C should be printed to the console by the method
```
 
##  :x: Grading Calculator
This is a more complex version of the activity above. This activity involves taking two arrays of values, earnedPoints and totalPoints, and has the associate display the average grade among all of them. 

Estimated time: 30 minutes

Associate facing instructions:
```
Today, we'll calculate a student's grade in a class as the average of all the scores they've earned on their assignments thus far.

Construct a method called gradeAverage that takes in two arrays of doubles, earnedPoints and totalPoints and returns void.

In these arrays, the index denotes both the points earned and the points available in each array respectively

Ex: earnedPoints[2] = 67 and totalPoints[2] = 100 meaning that on the assignment with index 2, the student earned 67/100 points

Using these two values, calculate the percentage of points earned on the assignment.

Repeat this for every index pair in earnedPoints and totalPoints.

Next, calculate the average score earned across all assignments and use this value to calculate the letter grade for the class:

<60.0% -> F
60.0 - 69.9% -> D 
70.0 - 79.9% -> C 
80.0 - 89.9% -> B
>= 90.0 -> A

Print the letter grade earned to the console

Ex: 
Input:
    earnedPoints = [5, 31, 16, 95, 78]
    totalPoints = [7, 40, 20, 100, 80]
Output:
    B

5/7 = .714
31/40 = .775
16/20 = .8
95/100 = .95
78/80 = .975

Avg Score = (.714 + .775 + .8 + .95 + .975)/5 = .843 or 84.3%

84.3% is between 80.0% and 89.9% thus the method should print B
```

If desired, supplemental instructions can be added as well for data validation, such as the following lines

``` 
The method should also provide basic validation, meaning it should notify the user if there are any "illegal" situations 
with the grades. Some examples of this might include if the arrays are different sizes, which would mean we'd have too 
many points on one side or the other. Another situation might be if a student earns negative points on an assignment. The 
method should check for these edge cases and act accordingly by printing something like "Cannot have different sized input 
arrays" or "Negative scores are not possible" instead of a letter grade.
```

## :white_check_mark: Hangman Game
Using the given template for a game of hangman, associates must draw the hangman based off the current `Player`'s life
 
Estimated time: 30 minutes

Associate facing instructions:
```
You're building a game of Hangman in Java. You're almost complete, but the last step is to draw the hangman. 

As the game is played, players attempt to guess letters of a hidden word before they run out of lives.

After each incorrect guess, a new body part is added to hangman until the entire body is there, signalling the end of the game due 
to no remaining guesses.

Inside the HangmanService class exists a method called draw(). Your goal is to alter this method so it accurately draws the hangman 
as a reflection of the total lives left. This should take in the number of lives the player currently has left and should display 
the appropriate hangman for that number of lives.

Note: You'll have to update the method signature for the draw() method to make sure it takes in the number of lives the player has 
remaining. You'll have to update where the method gets called to avoid any syntactical errors, so explore the template and be 
prepared to investigate the prewritten code.

Ex:

Input: 
    livesRemaining = 6
Output:
      _______
      |      |
      |
      |
      |
      |
    __|__

Input: 
    livesRemaining = 4
Output:
      _______
      |      |
      |      O
      |      |
      |      |
      |
    __|__

Input: 
    livesRemaining = 2
Output:
      _______
      |      |
      |      O
      |      |
      |      |
      |     / \
    __|__

Input: 
    livesRemaining = 0
Output:
      _______
      |      |
      |      O
      |     \|/
      |      |
      |     / \
    __|__


```