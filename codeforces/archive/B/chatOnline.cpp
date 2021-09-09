#include <bits/stdc++.h>

using namespace std;

#define ll long long
#define pb push_back
#define vi vector
#define pi pair

template <typename T>
vi<T> read(T n) {
    vi<T> v;
    T temp;
    while(n--) {
        cin>>temp;
        v.pb(temp);
    }
        
    return v;
}

int main() {
    int p=0,q=0,l=0,r=0,co=0;
cin>>p>>q>>l>>r;
r++;
int ap[50][2]={0},aq[50][2]={0};
for(int i=0;i<p;i++)
{cin>>ap[i][0]>>ap[i][1];}
for(int i=0;i<q;i++)
{cin>>aq[i][0]>>aq[i][1];}
 
 
for(int i=l;i<r;i++)
{
for(int k=0;k<q;k++)
{int o=aq[k][0]+i,f=aq[k][1]+i;
for(int j=0;j<p;j++)
{
bool b=0;
if(o>=ap[j][0]&&o<=ap[j][1]||o<=ap[j][0]&&f>=ap[j][0])b=1;
switch(b){case 1:co++;j=p;k=q;}
}
}}
cout<<co;
    return 0;
}