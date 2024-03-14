Feature: ToDoList
  Scenario: Adding new task
    Given I am using "chrome" browser
    When I want to add a new task with description "buy milk"
    Then Task "buy milk" will be added to list
  Scenario: Check a task
    Given I have a list
    Given I have added a task with description "buy milk"
    When I check the task
    Then the task "buy milk" is checked