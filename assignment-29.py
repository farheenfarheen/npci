num = int(input("enter the range of list: "))
key_set=[]
value_set=[]
# step 1 take elements from users
for i in range(num):
    inp = input("Enter a key:")
    key_set.append(inp)
    inp2 = int(input("Enter a value:"))
    value_set.append(inp2)

# step 2 creating dict
dictn = {key_set[i]: value_set[i] for i in range(num) }
print(dictn)

# step 3 sorting the dict
# dictn ={'z': 9, 'd': 0, 'c': 888}
dictn = dict(sorted(dictn.items(), key= lambda v:v[0]))
print(dictn)