# -*- coding: utf-8 -*-
"""
Created on Sat May  4 20:35:18 2019

@author: HEMANT DHIMAN
"""
a = int(input('Enter first number: '))
b = int(input('Enter second number: '))

print('sum: ',a+b)
print('subtraction: ',a-b)
print('division using / return in float: ',a/b)
print('division using // return in integer: ',a//b)
print('multiplication: ',a*b)
print('modulus: ',a%b)

string = str(input('Enter String: '))
print('Entered string: ',string)
print('string multiply with 3 ',(string*3))

for i in string:
    print(i)