# Job Salary Survey

A command-line Java application for entering job salary data and calculating salary statistics.

This project began as an introductory Java exercise and is being improved with input validation, clearer program structure, testing, and additional salary-analysis features.

## Features

- Enter job titles and annual salaries
- Classify jobs as inside or outside the Eurozone
- Calculate the highest and lowest salaries
- Calculate the average salary
- Calculate separate Eurozone minimum and maximum salaries
- Validate menu choices, job titles, salaries, and yes/no responses
- Display salaries using Euro currency formatting

## Requirements

- Java Development Kit (JDK) 11 or newer
- Git

Check your Java installation with:

```bash
java -version
javac -version
```

## Installation

Clone the repository:

```bash
git clone https://github.com/Andorta/JobSalarySurvey.git
```

Enter the project directory:

```bash
cd JobSalarySurvey
```

## Compile and Run

Compile the application:

```bash
javac -d . JobSalarySurvey.java
```

Run it:

```bash
java -cp . JobSalarySurvey
```

## Example

```text
1. Enter job data for survey
2. Calculate metrics
3. Exit
Enter your choice: 1

Enter job title: Software Developer
Enter yearly salary for Software Developer in EUR: 50000
Is this job in a Euro Zone country? (yes/no): yes
```

After selecting the metrics option:

```text
Job with the highest salary: Software Developer (€50,000.00)
Job with the lowest salary: Software Developer (€50,000.00)
Average salary: €50,000.00
Job with highest salary in Euro Zone: Software Developer (€50,000.00)
Job with lowest salary in Euro Zone: Software Developer (€50,000.00)
```

## Input Validation

The application rejects:

- Invalid menu choices
- Blank job titles
- Non-numeric salaries
- Zero and negative salaries
- Non-finite values such as `NaN` and `Infinity`
- Responses other than `yes` or `no` for the Eurozone question

## Project Structure

```text
JobSalarySurvey/
├── .gitignore
├── JobSalarySurvey.java
└── README.md
```

## Current Limitations

- Survey data exists only while the application is running
- Salaries are currently entered only in Euros
- The application uses a command-line interface
- Automated tests have not been added at the moment

## Roadmap

Planned improvements include the following:

- Maven project structure
- Automated tests with JUnit
- Separate model and service classes
- Persistent database storage
- REST API built with Spring Boot
- Browser-based dashboard and salary charts
- Support for additional currencies

## License

This project is licensed under the MIT License. See [LICENSE](LICENSE) for details.

## Author

Created by [Andorta](https://github.com/Andorta).