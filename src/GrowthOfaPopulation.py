#In a small town the population is p0 = 1000 at the beginning of a year. 
#The population regularly increases by 2 percent per year and moreover 50 new inhabitants per year 
#come to live in the town. How many years does the town need to see its population greater or equal to p = 1200 inhabitants?

def nb_year(p0, percent, aug, p):
    # your code
    a=p0
    count=0
    while a<p:
        a=int(a + a*percent/100 + aug)
        count+=1
    return count

p0=1000
percent=2.0
aug=50
p=1200
print(nb_year(p0,percent,aug,p))