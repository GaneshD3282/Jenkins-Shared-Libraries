def call(string projectname , string tag , string username){
  echo 'Building Image From Dockerfile'
  sh "docker build -t notes-app:latest ."
  sh "docker tag notes-app:latest ganeshd2505/notes-app:latest"
}
