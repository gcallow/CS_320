# CS_320
Repo for SNHU CS 320
_________________________________________________________________________________________________________________________________________________________________
How can I ensure that my code, program, or software is functional and secure?
To make sure code is functional, I write tests straight from the requirements and cover every one of them, including the edges. In the Contact Service, I tested
null values, IDs at the length limit and just over it, and I used assertThrows to confirm bad input gets rejected. Security starts with the same habit of never 
trusting input. Validating every field in the constructor and setters means bad or oversized data never gets stored. Unit tests alone do not prove software is 
secure, so on a real project I would also use code reviews, static analysis, and security testing.
_________________________________________________________________________________________________________________________________________________________________
How do I interpret user needs and incorporate them into a program?
I break the requirements into small, specific rules and treat each one as something I can check. For example, "phone must be exactly 10 digits" became a validation 
check in the Contact class and tests with 9 and 11 character numbers. If a requirement is unclear, I would ask the customer before guessing, since a wrong 
assumption ends up in both the code and the tests. At the end, I match each requirement to a test to make sure nothing was missed.
_________________________________________________________________________________________________________________________________________________________________
How do I approach designing software?
I start with the requirements and decide what each class is responsible for before writing code. In this project, the Contact class owns its data and validation, 
and ContactService only manages the collection of contacts, so the rules live in one place. I make fields like the contact ID final when they should not change, 
and I write tests alongside the code instead of after. I would rather keep a design simple and easy to test than make it clever.
