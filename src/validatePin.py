#ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
#If the function is passed a valid PIN string, return true, else return false.

def validate_pin(pin):
    #return true or false
    if ((len(pin)==4 or len(pin)==6) and pin.isdigit()==True):
        return True
    else:
        return False
    pass

code="155544"
print(len(code))

print(validate_pin(code))