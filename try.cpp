#include <bits/stdc++.h>
using namespace std;

template <typename T>
vector<T> tail(vector<T> l){
	return	vector<T> (l.begin()+1, l.end());
}

template <typename T>
T head(vector<T> l){
	return l[0];
}

template <typename T>
vector<T> concat(vector<T> first, vector<T> second){
	for(T i : second){
		first.push_back(i);
	}
	return first;
}

template<typename T>
vector<T> printlist(vector<T> list){
	for(T i: list){
		cout<<i<<" ";
	}
}

int sqr (int n){
	int nsqr = ( n *  n);
	return  nsqr;
}
int cube (int n){
	int ncube = ( n * sqr( n));
	return  ncube;
}


int main(){	    
	
	


     cout<<cube(4)<<endl;


	return 0;
}

