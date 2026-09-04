class Solution {
public:
    bool lemonadeChange(vector<int>& bills) {
        if(bills[0]>5)
        {
            return false;
        }

        unordered_map<int,int> money;
        money[5] = 0;
        money[10] = 0;
        money[20]  = 0;
        int m = 0;
        for(auto i:bills)
        {
            m++;
            if(i!=5)
            {
                int res = i-5;
                if(res==15)
                {
                    if(money[10])
                    {
                        money[10]--;
                    }
                    else
                    {
                         if(money[5]>=2)
                         {
                            money[5]-=2;

                         }
                         else
                         {
                            return false;
                         }
                    }
                    res-=10;

                }
                 if(res==5)
                 {
                    if(!money[res])
                    {
                        cout<<"sec"<<m;
                        return false;
                    }
                    else
                    {
                        money[res]--;

                    }
                 }
                
            }
             money[i]++;
        }
        return true;

    }
};