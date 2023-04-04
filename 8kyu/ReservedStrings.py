def solution(string):
    resultado=""
    for i in string:
        resultado= i + resultado
    
    return resultado
    


str= "world"
print(solution(str))