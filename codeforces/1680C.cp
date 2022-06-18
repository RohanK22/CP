#include <bits/stdc++.h>
#define MAXQ 200000
using namespace std;
typedef long long ll;
ll T, M, a, b, c, i, j, r;
string s;
int main() {
  cin >> T;
  for(ll _ = 0; _ < T; _++) {
    cin >> s;
    M = s.length();
    c = 0; 
    for(ll i = 0; i < M; i++) {
      if (s[i] == '1') {
        c++;
      }
    }
    i = 0; 
    j = 0;
    a = 0; 
    b = 0;
    r = c; 
    while (i <= M && j <= M) {
      if ((a+c) == b) {
        r = min(r, b);
        c -= (s[j] == '1' ? 1 : 0);
        b += (s[j] == '0' ? 1 : 0); 
        j++;
      } else if ((a+c) < b) { 
        a += (s[i] == '1' ? 1 : 0);
        b -= (s[i] == '0' ? 1 : 0);
        i++;
      } else {
        c -= (s[j] == '1' ? 1 : 0);
        b += (s[j] == '0' ? 1 : 0); 
        j++;
      }
    }
    cout << r << endl;
  }
}