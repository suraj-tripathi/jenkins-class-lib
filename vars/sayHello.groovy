def call(String text) {
  echo "Running this in vars by ${text}"
  echo "Current build number is: ${this.env.BUILD_NUMBER}"
}
