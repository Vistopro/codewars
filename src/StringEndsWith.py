#Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).

def solution(text, ending):
    # your code here...
    if(text[len(text)-len(ending):len(text)]==ending):
        return True
    else:
        return False
    

s1="aaabc"
s2="aabc"
print(solution(s1,s2))