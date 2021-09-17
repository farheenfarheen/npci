stack=[]
first=0
stack.append(12)
stack.append(2)
stack.append(15)
stack.append(6)
stack.append(3)
#stack created
print(stack)
#sorting stack
stack.sort()
print(stack)
first=stack[:1]
strings = [str(integer) for integer in first]
joining = "".join(strings)
a1 = int(joining) 
#first smallest number
second=stack[1:2]
strings1 = [str(integer) for integer in second]
joining1 = "".join(strings1)
a2 = int(joining1)
#second smallest number
a=[]
b=[]
queue=[]
#obtaining multiples of first smallest number
for i in range(1,5):
    temp=stack[i]
    if(temp%a1==0):
        a.append(temp)

print(a)
#obtaining multiples of second smallest number
for i in range(2,5):
    temp=stack[i]
    if(temp%a2==0):
        b.append(temp)

print(b)
#inserting elements into Queue
if(b>a):
    for i in range(len(b)):
        queue.insert(i,b[i])

    for i in range(len(a)):
        queue.insert(i,a[i])
else:
    for i in range(len(a)):
        queue.insert(i,a[i])
        
    for i in range(len(b)):
        queue.insert(i,b[i])
#printing Queue   
print(queue)
