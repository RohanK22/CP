#include <bits/stdc++.h>

using namespace std;

int main() {
    // https://www.geeksforgeeks.org/generate-n-bit-gray-codes/
    // Learn bit manipulation
    int n;
    cin>>n;

    for(int i = 0;i < (1 << n); i++) {
        int val = (i ^ (i >> 1));
         
        bitset<32> r(val);
        string s = r.to_string();
        cout << s.substr(32 - n) << endl;
    }
    return 0;
}
