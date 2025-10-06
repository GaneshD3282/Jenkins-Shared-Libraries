def call(string url , string branch){
  echo 'Fetching Code'
  git branch: "${branch}" , url: "${giturl}"
}
