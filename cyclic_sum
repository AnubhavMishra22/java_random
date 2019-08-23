n=int(input())
def digsum(n):
    sum=0
    while(n>0 or sum>9):
        if n==0:
            n=sum
            sum=0
        else:
            sum=sum+n%10
            n=n//10
    return sum
print(digsum(n))




OR


#include<isotream>  
using namespace std; 
  
int digSum(int n) 
{ 
    if (n == 0)  
       return 0; 
    return (n % 9 == 0) ? 9 : (n % 9); 
} 
  
// Driver program to test the above function 
int main() 
{ 
    int n = 9999; 
    cout<<digSum(n); 
    return 0; 
} 
 or
    
def digsum(n):
    if n==0:
        return 0
    else:
        if(n%9==0):
            return 9
        else:
            return n%9
a=int(input("Enter number"))
print(digsum(a))
