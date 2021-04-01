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

bool isEmpty (vector<int> l){
	bool vacio = ( l.size() == 0);
	return  vacio;
}
vector<int> reverseInner (vector<int> l , vector<int> acc){
	vector<int> ans {};
	
	if(isEmpty( l)){
		ans =  acc;
	}else{
		ans = reverseInner(tail( l),concat( {head( l)}, acc));
	}
	
	return  ans;
}
vector<int> reverse (vector<int> l){
	vector<int> reversed = reverseInner( l, {});
	return  reversed;
}
vector<vector<int>> splitInner (vector<int> l1 , vector<int> l2){
	vector<vector<int>> ans { {}};
	
	if(( l1.size() <=  l2.size())){
		ans =  {reverse( l2) ,  l1};
	}else{
		ans = splitInner(tail( l1),concat( {head( l1)}, l2));
	}
	
	return  ans;
}
vector<vector<int>> split (vector<int> l){
	vector<vector<int>> splitted = splitInner( l, {});
	return  splitted;
}
vector<int> merge (vector<int> L , vector<int> M){
	vector<int> ret {};
	
	if(isEmpty( L)){
		ret =  M;
	}else{
		
		
		if(isEmpty( M)){
			ret =  L;
		}else{
			
			
			if((head( L) < head( M))){
				ret = concat( {head( L)},merge(tail( L), M));
			}else{
				ret = concat( {head( M)},merge(tail( M), L));
			}
			
		}
		
	}
	
	return  ret;
}
vector<int> mergeSort (vector<int> l){
	vector<int> ans {};
	
	if(( l.size() < 2)){
		ans =  l;
	}else{
		ans = merge(mergeSort(head(split( l))),mergeSort(head(tail(split( l)))));
	}
	
	return  ans;
}


int main(){	    
	
	
    vector<int> arr {3 , 4 , 0 , 0 , 6 , 5 , 5 , 1 , 2};

    vector<int> answer = mergeSort( arr);


    printlist( answer);
	


	return 0;
}

