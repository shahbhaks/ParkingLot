PROBLEM STATEMENT:
We will focus on the following set of requirements while designing the parking lot:

The parking lot should have multiple floors where customers can park their cars - Done

The parking lot should have multiple entry and exit points - Done

The system should not allow more vehicles than the maximum capacity of the parking lot. If the parking is full, the system should be able to show a message that "Parking Lot is Full" - Done

Each parking floor will have many parking spots. The system should support multiple types of parking spots for Two-Wheeler, Four-Wheeler, Electric etc - Done

Customers can collect a parking ticket from the entry points and can pay the parking fee at the exit points on their way out - Done

Customers can pay the tickets at the exit panel to the parking attendant/operator. - TODO

Customers can pay via both cash and credit cards. - TODO

The Parking lot should have some parking spots specified for electric cars. These spots should have an electric panel through which customers can pay and charge their vehicles. - TODO

The system should support a per-minute parking fee model based on Vehicle Type. For example, PER_MIN_RATE_2_WHEELER=2, PER_MIN_RATE_4_WHEELER=5 - Done

PS - This project also containes some TODO. You can be my guest and can raise a PR with these TODO implemented :P

What the company is looking for or what are the company's expectations?
They are looking for people who can write code that has flexibility built-in, by adhering to the principles of Object-Oriented Development, and have the ability to deal with the real-life constraints/trade-offs while designing a system.

It is important to note that they are not looking for a GUI and they are not assessing you on the capabilities around code required to do the I/O. The focus is on the overall design. So, while building a solution, it would be nicer (not mandatory) if the input to the code is provided either via unit tests or a file. Using a command-line (for input) can be tedious and difficult to test, so it is best avoided (again not mandatory). Following is a list of things to keep in mind, before you submit your code for any LLD/OOD/OOPs round:

Clear identification of domain entities or classes and their relations with appropriate object modeling using composition.

Functionality should not be dumped in a single class, method, or file (don't create God class).

Write a clean Code with clear intention so as to have good readability (Proper Naming Conventions, Self-documenting code, Avoid redundant commenting, etc).

Clear and logical separation of responsibilities with proper boundaries (emphasis on single responsibility (SRP) for high cohesion).

Have you applied the principles of YAGNI and KISS?

Have you applied SOLID principles to your code?

Is the behavior of an object distinguished from its state and is the state encapsulated?

Have you looked at basic refactoring to improve the design of your code?

Are the principles applied in a pragmatic way.

Code should be easily extensible & maintainable

Atomicity and Coverage of Unit Tests.

Simplicity is the strongest trait of a piece of code. However, easily written code may not necessarily be simple code.

Why LLD/OOD/OOPs in software engineering interviews?
So main reason behind asking this kind of problems in an interview is to see whether a candidate can do the following:

Can a candidate write a working code in a given short span of time? So as to measure his/her delivery capability?

Can a candidate write highly readable, maintainable & extensible code? The intention must be clear by reading the code (Check 4 rules of simple design)

Can a candidate follow the principle of DRY (Don't Repeat Yourself) and avoid breaking encapsulation by following or Fat model pattern or Domain-Driven Design(DDD)? (Read tell don't ask principle and Law Demeter)

Can a candidate achieve the solution with a minimum number of elements using the YAGNI principle (that is without creating unnecessary interfaces etc)?

Rules they want you to follow:
You should not use any external libraries to solve this problem, but you can use external libraries or tools for building or testing purposes. Specifically, you can use unit-testing libraries or build tools available for your chosen language (e.g., JUnit, Ant, NUnit, Rspec, Rake, etc.).

They assess a number of things including the design aspect of your solution and your object-oriented programming skills. While these are small problems, They expect you to submit what you believe is production-quality code; code that you’d be able to run, maintain and evolve. You don’t need to gold plate your solution, however, we are looking for something more than a bare-bones algorithm.

Things I tried to follow in this project/repo:
Tried to create all the required domain entities/models as per the problem statement.

Tried not to break encapsulation by avoiding getters & setters (as much as possible).

Tried to have an immutable state with value objects (as much as possible) so as to avoid concurrency issues (Thread safety).

Tried to have readable methods & variables naming so as to clear the intention (4 rules of simple design).

Tried to have small & logical commits.

Tried to avoid code duplication by refactoring/reusing duplicate code (DRY).

Didn't make interfaces as per YAGNI principles because for now, I don't feel the need for the same (Yes, I am aware of this principle also - "Program to interfaces rather than concrete implementation").

Tried to put some comments so as to make business logic more understandable.

Wrote the job on every class so as to clear its use case.

Things I could have done/improved in this project/repo if given more time :
TDD with 100% code coverage.

Code duplication can be further reduced to some extent.

Level of indentation can be further reduced in some methods by breaking them into smaller methods.

Encapsulation of behavior in some classes can be further improved.

More mocking and stubbing of test data in unit tests.
