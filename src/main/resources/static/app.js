const healthButton = document.querySelector("#health-button");
const healthResult = document.querySelector("#health-result");

healthButton.addEventListener("click", () => {
    healthResult.textContent = "버튼 클릭을 확인했습니다!";
});