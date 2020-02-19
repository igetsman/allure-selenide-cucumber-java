Feature: Login User

  Scenario: 01 - Login user
    Then Click "Войти по паролю" button span
    Then Input login "test@email.com"
    Then Input password "Pwd123"
    Then Click submit button
    Then Content with "Неверный логин или пароль" visible

  Scenario: 02 - Short wrong Log on
    When Login to site as user "wrong@asd.com" - "pwd222"
    Then Content with "Неверный логин или пароль" visible

  Scenario: 03 - Navigate and log on
    Given Opened page "https://www.wildberries.by/services/besplatnaya-dostavka"
    Then Opened page "https://security.wildberries.by/login"
    When Login to site as user "wrong@asd.com" - "pwd222"
    Then Content with "Неверный логин или пароль" visible
