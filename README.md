# InheritanceExercise8
Working with Polymorphism

Program

Make a program to read data from N contributors (N provided by the user), which they can be a natural person or a legal entity, and then show the amount of tax paid by each one, as well as the total tax collected.\
`Individual data are:` name, annual income and health expenses. Legal entity data are name, annual income, and number of employees. The rules for calculating the tax are the following:\
`Individual:` persons whose income was below 20000.00 pay 15% tax. people with income from 20000.00 onwards pay 25% tax. If the person had health expenses, 50% of these expenses are deducted from the tax.\
`Example:` a person whose income was 50000.00 and had 2000.00 in health expenses, the tax stays: (50000 * 25%) - (2000 * 50%) = 11500.00\
`Legal entity:` legal entities pay 16% tax. However, if the company has more than 10 employees, she pays 14% tax.\
`Example:` a company whose income was 400000.00 and has 25 employees, the tax is:\
400000 * 14% = 56000.00