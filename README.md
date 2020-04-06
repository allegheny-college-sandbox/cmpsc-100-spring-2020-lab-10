# CMPSC 100-03 Lab Session 10: Bibliomancy
* Assigned: 6 April 2020
* Due: 23 April 2020
* Point value: 40 pts.

In this laboratory session, we explore topics including: 

* `while` loops
* Java `iterators`
* The `ArrayList`
* Interacting with and managing program "flow-of-control"
* Internal and external methods and objects

## Table of Contents

* [Accepting the assignment](#accepting-the-assignment)
* [Activity: Bibliomancy](#bibliomancy)
* [Evaluation](#evaluation)
* [GatorGrader](#gatorgrader)

## General guidelines for laboratory sessions

* **Follow steps carefully.** Laboratory sessions often get a bit more complicated than their preceeding Practical sessions. Especially for early sessions which expose you to platforms with which you may not be familiar, take notes on `command`s you run and their corresponding effects/outputs. If you find yourself stuck on a step, let a TL or the professor know! Laboratory sessions do not mean that we won't help you in the same way we do during Practicals.
* **Regularly ask and answer questions.** Some of you may have more experience with the topics we're discussing than others. We can use this knowledge to our advantage. But, like in Practicals, let students try things for a while before offering help (**always _offer_ first**). To ask questions, use our [Slack](https://cmpsc-100-02-sp-2020.slack.com)'s `#labs` channel.
* **Store and transfer files using GitHub.** Various forms of file storage are more or less volatile. *You* are responsible for backing up and storing files. If you're unsure of files which have been changed, you can always type `git status` in the terminal for your working folder to determine what you need to back up.
* **Keep all of your files.** See above, but also remember that you're responsible for the files you create.
* **Back up your files regularly.** See above (and above-above).
* **Review the [Honor Code](https://sites.allegheny.edu/about/honor-code/) regularly when working.** If you're taking a solution from another student or the Internet at-large (_especially_ [Stack Overflow](https://stackoverflow.com)), bear in mind that using these solutions _can_ constitute a form of plagiarism that violates the Allegheny Honor Code. While it may seem easy and convenient to use these sources, it is equally easy and convenient to rely on them and create bad habits which include not attributing credit or relying exclusively on others to solve issues. Neither are productive uses of your intellect. Really.

## Further helpful reading for this assignment

I recommend reading the [GitHub Guides](https://guides.github.com) which GitHub makes available. In particular, the guides:

* [Mastering Markdown](https://guides.github.com/features/mastering-markdown/)
* [Documenting your projects on GitHub](https://guides.github.com/features/wikis/)
* [GitHub Handbook](https://guides.github.com/introduction/git-handbook/)

## Bibliomancy

![Book shelf](https://cs.allegheny.edu/sites/dluman/cmpsc100/img/lab-07-bookcase.png)

Because G. Wiz _barely_ passed their A.W.E. (Annual Wizard Exam), they've decided to indulge another of their wizardly hobbies: collecting tomes. They've purchased a few to add to their library, a list iven you in the `inputs/book.list` file. This file is _tab delimited_.

To properly house their collection, they need a bookshelf and a catalog, which requires a couple of things from you:

* A print-friendly list of the books in the collection in the format of:

```
TITLE
AUTHOR
PAGE COUNT
```

* An estimate of how many "linear feet" the collection will take up

## Required deliverables

A successful submission for this lab includes two (2) Java files and one (1) `reflection.md` file.

- [ ] The repository should have at least 5 commits

### `DisplayLibrary.java`

- [ ] Contains no `TODO` markers
- [ ] Contains no `{Your Name Here}` markers
- [ ] Contains at least 10 single-line comments
- [ ] Imports all required libraries
- [ ] Implements a `Scanner` using `tab` as a delimiter to read data contained in each line
- [ ] Implements an `ArrayList` to store objects of the `Book` type
- [ ] Uses a `while` loop to `iterate` over the file
- [ ] Uses a `while` loop to `iterate` over the data
- [ ] Creates a `Book` object to store book data
- [ ] Uses the correct methods of a `Book` object to set:
  * Author
  * Title
  * Page count
- [ ] Initializes an identifier to track the amount of shelf space books take up
- [ ] Uses a `while` loop to print the contents of the `ArrayList` containing book objects
  * You will find it helpful to use either a `for` loop or an `Iterator` here
- [ ] Prints the final calculation of shelf space the tomes take up

A successful output should appear exactly like the following: 

```
This library contains 20 books.

Potions for Fun and Profit
Wiz Ard
123 pages

Potions in the Kitchen
Cook King
125 pages

Reptiles vs. Cats
Al E. Gator
724 pages

Reptile Digitomancy
T.H. Umbs
913 pages

Gator Wizard Quarterly: Vol. 1
Various
124 pages

Some Very Evil Magic
Don T. Reedthius
1945 pages

World Reptiles
Cosmo Politan
1484 pages

Spells Which are Probably Evil
Forb Idden
412 pages

Gator Wizard Quarterly: Vol. 2
Various
152 pages

Notions of Potions
Wiz Ard
99 pages

Potion Commotion: an Account of Failed Experiments
G. Wiz
50 pages

Representative Reptiles
Govern Ment
103 pages

Gator Wizard Quarterly: Vol. 3
Various
103 pages

Cats vs. Reptiles
Ulysses S. Cat
106 pages

How to Cackle: Flourishes for Evil Spells
Cru L.
75 pages

Gator Wizard Quarterly: Vol. 4
Various
176 pages

A Study of the Impact of Hats on Magical Style
Poin T. Lidz
58 pages

Spells You Shouldn't Ever Use
N.O. Looking
253 pages

Gator Wizard Quarterly: Vol. 5
Various
145 pages

I'm Fur Real: an Autobiography
Ulysses S. Cat
716 pages

It takes up 3.29 linear feet of shelf space.
```

### `Book.java`

This file is complete. However, you should reference it to get a handle on what methods are available to you. 

**You do not need to edit this file.**

### `reflection.md`

- [ ] Contains no `TODO` placeholder markers
- [ ] Contains at least 500 words
- [ ] Contains at least 10 headings
- [ ] Uses at least 3 code blocks
- [ ] Responds to _all_ questions

### Repository

- [ ] Has at least 3 `commit`s

## Accepting the assignment

- [ ] Log into the `#labs` channel in our class [Slack](https://cmpsc-100-02-sp-2020.slack.com)
- [ ] Click the link provided for the lab assignment and accept it in GitHub classroom
- [ ] Once the assignment finishes building, click the link to go to your personal repository assignment

## "Cloning" a repository

### Using the correct download link

- [ ] On this repository's page, click the `Clone or download` button in the upper right hand corner
* You may need to scroll up to see it
- [ ] In the upper right corner of the box that appears, click `Use SSH`
- [ ] Copy the link that appears in the textbox below the phrase "Use a password with a protected key."

### Cloning

- [ ] Type `ls` in your terminal window
* You should be in your `CMPSC100` directory
- [ ] Change directories (`cd`) to your `Labs` folder
- [ ] Once in the labs folder, "clone" the repository using the link copied above
* If I (the instructor) were to clone my own repository, I'd enter (your link will look different):
```
git clone git@github.com:allegheny-college-cmpsc-100-spring-2020/cmpsc-100-spring-2020-lab-10-dluman
```

## GatorGrader

### A note about `gradle`

`gradle` is a program which manages our program's many moving parts. It coordinates building, testing, compiling, and running our code -- tasks that will become more complex over the course of the semester in direct proportion to the complexity of our programs. There are three "tasks" that we will use extensively in this course.

#### `gradle build`

`gradle build` compares code against a set of convetions ("best practices") for creating legible code. There are many different standards for doing this, but our department chooses to follow the [Google Style Guide for the Java language](https://google.github.io/styleguide/javaguide.html). This includes such rules as:

* Each "level" of code being indented by 2 spaces
* Not using single-letter identifiers
* Enforcing consistent use of "Javadoc" (and other) comments
* ... and more!

These kinds of standard make reading code much easier, and help folks like our Technical Leaders (and me) read your code to figure out where something isn't going as planned.

#### `gradle run` (and its variants)

`gradle run` (and its counterpart `gradle -q --console plain run`) compile and run our Java programs. Once again, this will become more handy when we start to build projects that require _multiple_ files.

#### `gradle grade`

`gradle grade` runs the GatorGrader application. This application uses grading standards _specific to an assignment_. This means that the grading files created when you accept an assignment are the same ones by which I will evaluate your work: _once you've cloned an assignment, they do not change_.

You will use this command to grade your work before you turn it in, enabling you to know before I grade it what your grade will be.

#### Running GatorGrader directly on `container` start

- [ ] `cd` to your `CMPSC100` folder
- [ ] Locate the `cmpsc-100-spring-2020-lab-10` folder and `cd` to it.
    * Remember that if you run `ls -la`, you should see a `.git` folder if you're in the main repository folder.
- [ ] To make sure you're in the right repository, type `pwd` and press `Enter`
    * If you recieve the expected path, you're in the right place!

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator
```

#### Run `gradle` commands in the container`

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator bash
```

- [ ] To `build` your Java work, type `gradle build` at the `command` prompt and press the `Enter` key.
- [ ] To `grade` your Java work, type `gradle grade` at the `command` prompt and press the `Enter` key.

## Submitting the assignment/saving progress

The GitHub platform is a place to store your work. So, it makes some sense that should be able to _clone_ (download) from it, and push back (upload) to it. Here, we'll learn this second part.

- [ ] `cd` to your `CMPSC100` folder
- [ ] Locate the `cmpsc-100-spring-2020-lab-10` folder and `cd` to it.

Once in this folder, we need to tell git that there have been changes.

- [ ] Type `git add .` and press `Enter`
* This tells git to look through the _entire_ folder structure for new changes and "stage" them

- [ ] Type `git commit -m "{Commit message}"` to "label" the commit
* This is typically something like `git commit -m "Fixing a typo"` -- the message in quotes should be as descriptive as possible, while still remaining somewhat short

- [ ] To send all changes to the server, type `git push`
- [ ] At the prompt, input the password associated with the `SSH Key` you created earlier in this exercise (yesterday)

Once the process finishes successfully, we're done!
