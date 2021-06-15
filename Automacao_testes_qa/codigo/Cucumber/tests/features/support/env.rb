#require 'cucumber'

require 'capybara/cucumber'
require 'selenium-webdriver'

Capybara.configure do |config|
    #selenium -> [Padrão], vai usar o Firefox pra rodar os testes
    #selenium_chrome -> Vai rodar os testes no Chrome com a GPU
    #selenium_chrome_healess -> Vai rodar os testes no Chrome sem a GPU

    config.default_driver = :selenium_chrome # -> Navegador que queremos rodar
    config.app_host = 'https://automacaocombatista.herokuapp.com' # -> IP que receberá os testes
    config.default_max_wait_time = 5 # -> Tempo em segundos aguardado para aparecer o elemento X, caso não apareça, vai falhar

end
