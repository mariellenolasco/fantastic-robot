# Data Structures and Algorithms
## Scope
The goal of the activities below is give associates first-hand experience working with different data structures to help them learn how to use the structures themselves as well as understand the possible scenarios in which to use each individual structure. Similarly, the activities for algorithms is designed to help associates learn how basic sorting and searching algorithms are constructed and utilized.

## Legend For Activity Guide

- :white_check_mark: - Tested successfully with a live batch
- :warning: - Tested with live batch with minor bugs/alterations
- :x: - Never tested with a live batch


##  :x: Flashcard Hashmap Application
Construct a simple flashcard application using hashmaps
 
Estimated time: 30 minutes

Associate facing instructions:
```
Today, we'll construct a flashcard application to help you study the various topics you learn during training.

During training there will often be topics that are covered that will need to be memorized so you can answer questions for both QC and for an actual interview. One of the simplest ways to memorize these various topics is to leverage flashcards.

Your goal for today is to leverage the HashMap data structure to build a flashcard application. Why are we utilizing a HashMap? Flashcards typically come in the form of a term on one side and a definition on the other. In concept, this is actually very similar to a dictionary. Because of this, a HashMap is an obvious choice for working with this data since we have a list of key value pairs, or in this case, term definition pairs. Using a HashMap will allow us to have both our terms and our definitions as well as link them together in a meaningful way.

Using the template provided, you'll construct the populateCards() method which will be used to fill out the studyGuide HashMap that's declared at the class level. Make sure the method adds at least 5 cards to the 'studyGuide' HashMap. One such example for a card might be "OOP" as the term and "Object Oriented Programming" as the definition.

Now that we've added in some terms, we need to actually construct the game itself. Inside the main method, you'll need to create logic that loops over the HashMap and quizzes the user. For each individual entry in the map, the applcation should provide the user with the definition and the user should respond with the term. From there, it's simply a matter of checking whether the inputted term matches what we have in our HashMap. This result should be indicated to the user in the form of 'Correct!' or 'Incorrect!' printing to the console.

The final step is to handle what happens when a user gets a question wrong. If the user got the question correct, it's likely they don't need to study it again, but if it's wrong, they definitely should see that question in a subsequent round of questioning. Your goal is to find a way to present the questions the user got wrong in the previous round again, until they go a whole round without getting any questions wrong, at which point you should declare to the user that the game is completed
```

There is a sample solution included with this acitivity.
 
