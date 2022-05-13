// Thanks for the template tmwilliamlin168

#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ld long double
#define ar array
#define pi pair
#define vt vector
#define pb push_back
#define endl "\n"
#define all(c) (c).begin(), (c).end()
#define sz(x) (int)(x).size()
#define F_OR(i, a, b, s) for (int i = (a); (s) > 0 ? i < (b) : i > (b); i += (s))
#define F_OR1(e) F_OR(i, 0, e, 1)
#define F_OR2(i, e) F_OR(i, 0, e, 1)
#define F_OR3(i, b, e) F_OR(i, b, e, 1)
#define F_OR4(i, b, e, s) F_OR(i, b, e, s)
#define GET5(a, b, c, d, e, ...) e
#define F_ORC(...) GET5(__VA_ARGS__, F_OR4, F_OR3, F_OR2, F_OR1)
#define FOR(...)       \
	F_ORC(__VA_ARGS__) \
	(__VA_ARGS__)
#define EACH(x, a) for (auto &x : a)
#define sq(x) x *x
#define cu(x) x *x *x

// Reading
template <class A>
void read(vt<A> &v);
template <class A, size_t S>
void read(ar<A, S> &a);
template <class T>
void read(T &x)
{
	cin >> x;
}
void read(double &d)
{
	string t;
	read(t);
	d = stod(t);
}
void read(long double &d)
{
	string t;
	read(t);
	d = stold(t);
}
template <class H, class... T>
void read(H &h, T &...t)
{
	read(h);
	read(t...);
}
template <class A>
void read(vt<A> &x)
{
	EACH(a, x)
	read(a);
}
template <class A, size_t S>
void read(array<A, S> &x)
{
	EACH(a, x)
	read(a);
}

// Writing
string to_string(char c)
{
	return string(1, c);
}
string to_string(bool b)
{
	return b ? "true" : "false";
}
string to_string(const char *s)
{
	return string(s);
}
string to_string(string s)
{
	return s;
}
string to_string(vt<bool> v)
{
	string res;
	FOR(sz(v))
	res += char('0' + v[i]);
	return res;
}

template <size_t S>
string to_string(bitset<S> b)
{
	string res;
	FOR(S)
	res += char('0' + b[i]);
	return res;
}
template <class T>
string to_string(T v)
{
	bool f = 1;
	string res;
	EACH(x, v)
	{
		if (!f)
			res += ' ';
		f = 0;
		res += to_string(x);
	}
	return res;
}

template <class A>
void write(A x)
{
	cout << to_string(x);
}
template <class H, class... T>
void write(const H &h, const T &...t)
{
	write(h);
	write(t...);
}
void print()
{
	write("\n");
}
template <class H, class... T>
void print(const H &h, const T &...t)
{
	write(h);
	if (sizeof...(t))
		write(' ');
	print(t...);
}

void solve()
{
	int n, m;
	read(n, m);
	char a[n][m];
	int i = 0, j = 0;
	int rCount = 0;
	F_OR2(i, n)
	{
		F_OR2(j, m)
		{
			read(a[i][j]);
			if (a[i][j] == 'R')
				rCount++;
		}
	}
	if (rCount == 1 || (n == 1 || m == 1))
	{
		write("YES\n");
		return;
	}
	else
	{
		// Find top left most R
		int minLeftOffset = INT_MAX, minUpOffset = INT_MAX;
		int leftMostLOffset = INT_MAX, leftMostUpOffset = INT_MAX;
		int upMostLOffset = INT_MAX, upMostUpOffset = INT_MAX;
		i = 0, j = 0;
		F_OR2(i, n)
		{
			F_OR2(j, m)
			{
				if (a[i][j] == 'R')
				{
					if (minLeftOffset > i) {
						leftMostLOffset = i;
						leftMostUpOffset = j;
						minLeftOffset = i;
					}
					if (minUpOffset > j) {
						upMostLOffset = i;
						upMostUpOffset = j;
						minUpOffset = j;
					}
					// if(minLeftOffset < i) minLeftOffset = i;
					// if(minUpOffset < j) minUpOffset = j;
				}
			}
		}
		// write("LMOST:", leftMostLOffset, " ", leftMostUpOffset, "\n");
		// write("LMOST:", upMostLOffset, " ", upMostUpOffset, "\n");
		if(leftMostLOffset != upMostLOffset || leftMostUpOffset != upMostUpOffset)//minLeftOffset < leftMostLOffset || minUpOffset < upMostUpOffset)
		{
			write("NO\n");
			return;
		} 
		else {
			write("YES\n");
			return;
		}
	}
}

int main()
{
	ios::sync_with_stdio(0);
	cin.tie(0);

#ifndef ONLINE_JUDGE
	freopen("input.txt", "r", stdin);
	freopen("output.txt", "w", stdout);
#endif

	int t = 1;
	read(t);
	for (int i = 0; i < t; i++)
	{
		// cout<<"Case #" <<(i+1)<<": "<<endl;
		solve();
	}
	return 0;
}