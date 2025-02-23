# Simple Java Quiz Application (Console Based)

## Overview
This project is a basic **console-based quiz application** developed in **Java**. It allows users to answer multiple-choice questions and then calculates their score. The program follows an **object-oriented approach**, organizing questions into objects and handling user interactions.

---

## Working Flow of the Quiz Application

### 1. Application Startup (`Main.java`)
- The `main` method initializes a `QuestionService` object.
- Calls `playQuizz()` to start the quiz.
- Calls `getScore()` to display the user's score.

### 2. Managing Questions (`QuestionService.java`)
- The `QuestionService` class initializes an array of `Question` objects (5 in this case).
- The constructor populates predefined multiple-choice questions.
- A `selection` array is used to store the user's answers.

### 3. Quiz Execution (`playQuizz` method)
- Iterates through each question and displays it along with four options.
- Uses `Scanner` to capture the user's answer.
- Stores the selected answer in the `selection` array.

### 4. Score Calculation (`getScore` method)
- Compares user-selected answers with the correct ones stored in `Question` objects.
- Increments the score for each correct answer.
- Displays the final quiz score.

### 5. Question Representation (`Question.java`)
- The `Question` class defines the structure of each question.
- Contains attributes like `id`, `question`, options (`opt1`, `opt2`, `opt3`, `opt4`), and the correct answer.
- Provides getter and setter methods to access or modify values.

---

## Example Execution

**Console Output:**
```sh
Question No :1
Question : Prime Minister of India ?
option 1 : Narendra Modi
option 2 : Amit shah
option 3 : Nitin gadakari
option 4 : Pankaj
>> Narendra Modi   (User input)

Question No :2
Question : President of India ?
option 1 : Amit shah
option 2 : Narendra Modi
option 3 : Nitin gadakari
option 4 : Dropati Muramu
>> Dropati Muramu   (User input)

...
Your Quizz Score : 4
```

---

## Improvements & Enhancements
- **Use a `List<Question>` instead of an array** for flexibility.
- **Close the `Scanner` object** to avoid memory leaks.
- **Validate user input** to ensure correct option selection.
- **Shuffle questions and options** for randomness.
- **Enhance UI** using a GUI framework like Java Swing or JavaFX.

---

Would you like any modifications or additional features, such as a **timed quiz** or **score leaderboard**? 🚀

