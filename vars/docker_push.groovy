def call(String ProjectName , String ImageTag, String dockerHubUser){
  withCredentials([usernamePassword(credentialsId: "DockerHubkey", passwordVariable: "docker_Pass", usernameVariable: "docker_User")]) {
      sh "docker login -u ${docker_User} -p ${docker_Pass}"
  }
  sh "docker push ${dockerHubUser}/${ProjectName}:${ImageTag}"
}
 
