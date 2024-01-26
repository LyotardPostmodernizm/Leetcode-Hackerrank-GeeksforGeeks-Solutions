def sortArray(array:list):
    #l -> left ,   r-> right
    n = len(array)
    l=0
    r = n-1
    i=0

    while i<n and i<=r:
        if array[i]==0:
            array[i],array[l] = array[l],array[i]
            l+=1
            i+=1
        elif array[i]==1:
            i+=1
        else:   #array[i]=2
            array[i],array[r] = array[r],array[i]
            r-=1
    return array





if __name__ =="__main__":
    lst = []
    n=int(input("Please enter the length of the array:"))
    for i in range(n):
        ele=int(input(f"Please enter {i+1}th element of array:")) #All the elements must be 0,1 or 2
        lst.append(ele)
    print("Before sorting:")
    print(lst)
    print("After sorting:")
    print(sortArray(lst))
