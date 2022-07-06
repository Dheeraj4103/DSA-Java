#include <bits/stdc++.h>
#define ll long long int
using namespace std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(0);
    ll t;
    cin >> t;
    while (t--){
        int n;
        cin >> n;
        int high = 0, low = 1;
        for (int i = 1; i <= n; i++)
        {
            high = low + 4;
            if (i % 2 == 0){
                for (int j = high; j >= low; j--){
                    cout << j << " ";
                }
            }
            else{
                for (int j = low; j <= high; j++){
                    cout << j << " ";
                }
            }
            low = high + 1;
            cout << "\n";
        }
    }
    return 0;
}