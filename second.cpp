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

int ackerman (int m , int n){
	int res = 0;
	
	if(( m == 0)){
		res = ( n + 1);
	}else{
		
		
		if(( n == 0)){
			res = ackerman(( m - 1),1);
		}else{
			res = ackerman(( m - 1),ackerman( m,( n - 1)));
		}
		
	}
	
	return  res;
}


int main(){	    
	
	


     cout<<ackerman(3,1)<<endl;


	return 0;
}

