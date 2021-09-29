# Project 3
In this project, you will write code which will use `Abstraction`, and `Inheritance`.

# Teams
You may partner with another student on this project to discuss code and strategies for completing the various parts of the assignment. You may share code with your partner, but you should still write much of your own code in your own repository. You should still update your repository (by pushing) incrementally as you make progress. It is up to teammates to ensure that their partner adheres to the <a href="https://www.american.edu/academics/integrity/code.cfm">American University Honor Code.</a> You may use [pair programming](https://en.wikipedia.org/wiki/Pair_programming), however, you must each take turns in the driver role on your own laptop. I should see commits and a submission on Github for each of you to get full credit for this assignment. If you decide to work with a partner, modify the statement below:

- [x] I worked with Amanda on this project.
- [ ] I worked on my own.

## Step 1 - Create the Repo for your Team.
1. **Both members** will clone the repository to your local machines (i.e., using `git clone <URL>`). You will then each have a local repository that is linked to the shared repository, and can work on the code together.
1. As a reference for how to use git, I suggest <a href='http://codingdomain.com/git/'>this site</a>, as it avoids some of the more complicated theory behind git and focuses on the bare minimum practicalities.

## Step 2 - Create an `abstract` Student class
The class should have the following **restricted** attributes:
1. name
1. gpa
1. year

## Step 3 - `getters & setters` 
Create **getters & setters** for the your Student class's attributes

## Step 3.5 - Commit and Push to Github
Remember, this is not like using Blackboard for submitting assignments. As you are working with your teammate, you will need to frequently push code to the Github repo. If you wait to the last minute, you could have conflicts that are difficult to resolve. It is much better to get into a rhythm with your partner early. To get full credit for your part in this, I need to see multiple commits from each team member.

## Step 4 - `Constructors` 
Create **2** constructors:
1. The **first constructor** will just take **1** argument/parameter to emulate a freshman. When a freshman enters college let us assume that their GPA is always 4.0 and year is always 0. The only thing that is unique for each freshman is their name.
1. The **second constructor** will take **3** arguments/parameters in order to assign values for all the attributes.

## Step 5 - `abstract boolean readyToGraduate()` method
An unimplemented method.

## Step 6 - Create a `Phd subclass` of the `Student class`
The **subclass** will have the following restricted attributes:
1. advisor
1. numberOfPapersPublished

## Step 7 - `Constructor` 
The Phd subclass has a single constructor which takes **5** arguments/parameters to assign values to the appropriate attributes.

## Step 8 - `getters & setters` 
Create **getters & setters** for the your Phd class's attributes

## Step 9 - `implement the abstract method`
The **readyToGraduate()** will implement the following logic; a phd student can only graduate if he or she:
1. Has published more that 20 papers
1. Has studied for more that 5 years

## Step 10- Push to Github
Do not forget to push your final submission to Github before the deadline.

# Grading
Grading will be assigned according to the following categories. As described in the syllabus, each category can receive a  &#10003; (satisfactory); a &#10003;+ (above and beyond); a &#10003;- (incorrect, incomplete, or sloppy); or in the worst case an &#10005;, meaning it was incorrect in several ways. A category assigned an &#10005; can carry significant grade penalties for this assignment, but usually does not receive more than 50% of the possible credit for an task.

Missing components receive a score of zero, but it is better to be missing a component (or comment it out) instead of submitting code that does not compile. Code that does not compile will not be graded, and a zero will be assigned for the project. Submitted code that contains runtime errors will be graded at the instructor's discretion.

1. **10%** Multiple commits were made throughout the project as progress was made, not just one big upload at the end.
1. **10%** The code is easy to follow and understand. Good comments, meaningful variable names, and good indentation are all present.
1. **15%** `Constructors` were implemented for the `abstract` superclass
1. **20%** `Abstraction` was appropriately practiced. The `abstract unimplemented method` was declared appropriately and `implemented appropriately`.
1. **20%** `Inheritance` was implemented appropriately across the `Student` and `Phd` classes.
1. **5%** Getters and setters are created and used for the attributes of the classes.
1. **15%** Create an instance of the `Phd` class. Show me the concept of `Polymorphism`; where an instance can act as both subclass and superclass.
1. **5%** The results are printed cleanly at the end.

