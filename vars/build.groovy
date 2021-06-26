def call(String mavenGoal){
  
  if ("${mavenGoal}" == "Clean")
     {
       bat "mvn clean"
     }
  else if ("${mavenGoal}" == "Compile")
     {
       bat "mvn clean compile"
     }
  else if ("${mavenGoal}" == "Test")
     {
       bat "mvn clean test"
     }
   else if ("${mavenGoal}" == "Package")
      {
        bat "mvn clean package"
     }
}
