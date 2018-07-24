a=raw_input()
c=len(a)
b=raw_input()
d=len(b)
if c==d:
   print(a or b)
elif c>d:
   print(a)
else:
   print(b)
