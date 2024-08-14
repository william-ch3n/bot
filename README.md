# William Bot Application

## Feature
1. Twitter bot:
   - It will automatically post tweet twice per hour
   - It is controlled by spring boot crontab
   - The tweet text can be modified, refer to the Enum class ``Messages`` 

## Comment
1. Twitter bot 
   - It is using the dependency of ``twittered`` which I think is the best and easiest one to use.
   - It requires only 4 parameters to launch the twitter client which you have to get from your own twitter developer account, 
   and you need to create an app on X developer portal and put it inside a project, then you need to generate these keys. 
     - consumer key
     - consumer secret
     - access key
     - access secret

## Reference
1. [My X Developer Portal](https://developer.x.com/en/portal/projects/1820000468946604032/apps/29147115/settings)
