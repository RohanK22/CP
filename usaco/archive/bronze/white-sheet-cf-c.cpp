#include <bits/stdc++.h>
#define ll long long
using namespace std;

struct Rect {
	ll x1, y1, x2, y2;
	ll area() { return (y2 - y1) * (x2 - x1); }
};

ll intersect(Rect p, Rect q) {
	ll xOverlap = max((ll)0, min(p.x2, q.x2) - max(p.x1, q.x1));
	ll yOverlap = max((ll)0, min(p.y2, q.y2) - max(p.y1, q.y1));
	return xOverlap * yOverlap;
}

ll intersectThree(Rect a, Rect b, Rect c) {
	ll xOverlap = max(min(min(a.x2, b.x2), c.x2) - max(max(a.x1, b.x1), c.x1), (ll)0);
	ll yOverlap = max(min(min(a.y2, b.y2), c.y2) - max(max(a.y1, b.y1), c.y1), (ll)0);
	return xOverlap * yOverlap;
}

int main() {
    cin.tie(0);

	Rect w, b1, b2;  // billboards a, b, and the truck
	cin >> w.x1 >> w.y1 >> w.x2 >> w.y2;
	cin >> b1.x1 >> b1.y1 >> b1.x2 >> b1.y2;
	cin >> b2.x1 >> b2.y1 >> b2.x2 >> b2.y2;
    
    ll diff = w.area() - intersect(w, b1) - intersect(w, b2)+ intersectThree(w, b1, b2);

    if(diff == 0)  
        cout<<"NO";
    else   
        cout<<"YES";
}