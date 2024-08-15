'''
	A program that would accept two(2) integer values
	and display their sum,difference,product,quotient
	using module(function/method)
'''
import os

def sum(value1:int,value2:int)->int: 
    return value1+value2
def difference(value1:int,value2:int)->int: 
    return value1-value2
def product(value1:int,value2:int)->int: 
    return value1*value2
def quotient(value1:int,value2:int)->int: 
    return value1/value2

def main()->None:   #void main()
    os.system("cls")
    try:
        value1:int = int(input("Enter first value  :"))
        value2:int = int(input("Enter second value :"))
        print(f"the sum of {value1} and {value2} is {sum(value1,value2)}")
        print(f"the difference of {value1} and {value2} is {difference(value1,value2)}")
        print(f"the product of {value1} and {value2} is {product(value1,value2)}")
        print(f"the quotient of {value1} and {value2} is {quotient(value1,value2)}")
    except:
        print("Invalid Input")

if __name__=="__main__":
    main()