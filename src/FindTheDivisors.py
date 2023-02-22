##Create a function named divisors that takes an integer n > 1 and returns an array 
##with all of the integer's divisors(except for 1 and the number itself), from smallest to largest. If the number is 
##prime return the string '(integer) is prime'

def divisors(integer):
    numberList=[]
    count=2
    while(count<integer):
        if integer%count==0:
            numberList.append(count)
        count+=1
    if len(numberList)==0:
        return("'{} is prime'".format(integer))
    else: return numberList


number=13
print(divisors(number))