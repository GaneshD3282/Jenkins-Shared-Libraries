def call(string ProjectName , string ImageTag, string dockerHubUser){
  withCredentials([usernamePassword(credentialsId: 'DockerHubKey', passwordVariable: 'dockerHubPass', usernameVariable: 'dockerHubUser')]) {
      sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
  }
  sh "docker push ${dockerHubUser}/${ProjectName}:${ImageTag}"
}
 
