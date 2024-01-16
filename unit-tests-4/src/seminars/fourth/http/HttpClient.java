package seminars.fourth.http;

/**
 * Вам нужно написать тест с использованием моков для класса, который выполняет HTTP-запросы.
 * Условие: У вас есть класс HttpClient с методом public String get(String url), который выполняет
 * HTTP-запрос и возвращает результат. Вам необходимо проверить правильность работы класса
 * WebService, который использует HttpClient для получения данных с веб-сайта.
 */

public class HttpClient {
    public String get(String url){
        return "\n" +
                "<!DOCTYPE html><html lang=\"ru\"><head>\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <title>EWA PRODUCT - официальный сайт</title>\n" +
                "    <base href=\"/\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "    <link rel=\"icon\" type=\"image/png\" href=\"favicon.png\">\n" +
                "    <link rel=\"preconnect\" href=\"https://ik.imagekit.io\">\n" +
                "    <meta property=\"og:locale\" content=\"ru_RU\">\n" +
                "    <meta property=\"og:type\" content=\"website\">\n" +
                "    <meta property=\"og:title\" content=\"EWA PRODUCT - официальный сайт\">\n" +
                "    <meta property=\"og:description\" content=\"EWA PRODUCT - Молодая и амбициозная компания с инновационной системой вознаграждения своих партнеров.\">\n" +
                "    <meta property=\"og:url\" content=\"https://ewaproduct.com/\">\n" +
                "    <meta property=\"og:site_name\" content=\"EwaProduct\">\n" +
                "    <meta property=\"og:image\" content=\"/assets/img/ewa-og-logo.png\">\n" +
                "    <meta property=\"og:image:width\" content=\"800\">\n" +
                "    <meta property=\"og:image:height\" content=\"600\">\n" +
                "    <meta property=\"og:image:type\" content=\"image/png\">\n" +
                "    <style>:root{--mdc-shape-medium:8px;--mdc-typography-body1-font-family:\"Raleway\", \"sans-serif\";--mdc-typography-font-family:\"Raleway\", \"sans-serif\";--mdc-typography-body2-font-family:\"Raleway\", \"sans-serif\";--mdc-typography-caption-font-family:\"Raleway\", \"sans-serif\";--mdc-dialog-supporting-text-font:\"Raleway\", \"sans-serif\"}@charset \"UTF-8\";*{padding:0;margin:0;border:0;line-height:100%}*,*:before,*:after{box-sizing:border-box}html,body{height:100%;width:100%;font-size:100%;line-height:100%;-ms-text-size-adjust:100%;-moz-text-size-adjust:100%;-webkit-text-size-adjust:100%;font-variant-numeric:lining-nums;font-feature-settings:\"lnum\";-moz-font-feature-settings:\"lnum=1\";-ms-font-feature-settings:\"lnum\";-webkit-font-feature-settings:\"lnum\";-o-font-feature-settings:\"lnum\"}@font-face{font-family:Raleway;src:url(Raleway-Light.20290afc650f99de.woff2) format(\"woff2\"),url(Raleway-Light.2220efafad6226db.woff) format(\"woff\"),url(Raleway-Light.1f6da6d749d7e985.ttf) format(\"truetype\");font-weight:300;font-style:normal;font-display:swap}@font-face{font-family:Raleway;src:url(Raleway-Regular.fed612c27a9adb1c.woff2) format(\"woff2\"),url(Raleway-Regular.3776fa9bb481c640.woff) format(\"woff\"),url(Raleway-Regular.9fb2e1829660c081.ttf) format(\"truetype\");font-weight:400;font-style:normal;font-display:swap}@font-face{font-family:Raleway;src:url(Raleway-Medium.b00d82453799ca1f.woff2) format(\"woff2\"),url(Raleway-Medium.dbbcde2e35526b11.woff) format(\"woff\"),url(Raleway-Medium.2eaf62bc261d3708.ttf) format(\"truetype\");font-weight:500;font-style:normal;font-display:swap}@font-face{font-family:Raleway;src:url(Raleway-SemiBold.4453fed796de3809.woff2) format(\"woff2\"),url(Raleway-SemiBold.dae903df18380d22.woff) format(\"woff\"),url(Raleway-SemiBold.fd5b6062ff189a06.ttf) format(\"truetype\");font-weight:600;font-style:normal;font-display:swap}@font-face{font-family:Raleway;src:url(Raleway-Bold.23a36aefed3b82b8.woff2) format(\"woff2\"),url(Raleway-Bold.cac10b35637d2fb3.woff) format(\"woff\"),url(Raleway-Bold.36cb3d86b2745771.ttf) format(\"truetype\");font-weight:700;font-style:normal;font-display:swap}html,body{margin:0;height:100%;font-family:Raleway,sans-serif;background:#fafafa}@media (max-width: 480px){html,body{font-size:.9375rem}}html{scrollbar-gutter:stable}:root{--f-spinner-width:36px;--f-spinner-height:36px;--f-spinner-color-1:rgba(0, 0, 0, .1);--f-spinner-color-2:rgba(17, 24, 28, .8);--f-spinner-stroke:2.75}:root{--f-button-width:40px;--f-button-height:40px;--f-button-border:0;--f-button-border-radius:0;--f-button-color:#374151;--f-button-bg:#f8f8f8;--f-button-hover-bg:#e0e0e0;--f-button-active-bg:#d0d0d0;--f-button-shadow:none;--f-button-transition:all .15s ease;--f-button-transform:none;--f-button-svg-width:20px;--f-button-svg-height:20px;--f-button-svg-stroke-width:1.5;--f-button-svg-fill:none;--f-button-svg-filter:none;--f-button-svg-disabled-opacity:.65}</style><link rel=\"stylesheet\" href=\"styles.ebafe4418a0d5ab2.css\" media=\"print\" onload=\"this.media='all'\"><noscript><link rel=\"stylesheet\" href=\"styles.ebafe4418a0d5ab2.css\"></noscript></head>\n" +
                "    <body>\n" +
                "    <app-root></app-root>\n" +
                "    <script src=\"runtime.e0b59883c7fb6969.js\" type=\"module\"></script><script src=\"polyfills.21cda2919324120d.js\" type=\"module\"></script><script src=\"main.846acfbe0bbe5bc4.js\" type=\"module\"></script>\n" +
                "    </body></html>";
    }
}
