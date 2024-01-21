from collections import defaultdict
from typing import List


def most_frequents(a:List):
    mp = defaultdict(int)
    values=[]
    count=0
    for i in a:
        mp[i]+=1
        if mp[i]>=count:
            count = mp[i]

    for key in mp:
        if mp[key] == count:
            values.append(key)



    print("Most frequent elements are:")
    print(values)



#def most_common(lst):    #Easy function to solve this problem
#   return max(set(lst), key=lst.count)


if __name__ =="__main__":
    lst = []
    n=int(input("Please enter the length of the array:"))
    for i in range(n):
        ele=int(input(f"Please enter {i}th element of array:"))
        lst.append(ele)

    most_frequents(lst)