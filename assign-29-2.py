a = [
 ['Mohsin', 'mn@gg.com', '1283'],
 ['Test', 'tt@user.com', '9999'],
 ['Username', 'email', '12478'],
 ['Hello', 'email@34','9456']
 ]
with open('sample.txt', 'w') as r:
r.write("name,email,phone \n")
for i in a:
p = 0
while p < len(i) - 1:
r.write(i[p])
r.write(',')
p += 1
r.write(i[p])
r.write('\n')