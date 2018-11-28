# Project2
<h2>Description</h2>
<p>An personal finance management web application</p>


<h2>Technology Stack</h2>
<ul>
  <li>Java</li>
  <li>AWS RDS</li>
  <li>CI/CD pipeline</li>
  <li>Hibernate</li>
  <li>Spring MVC</li>
  <li>Angular</li>
  <li>Bootstrap</li>
  <li>Log4j</li>
  <li>Sonarlint</li>
  <li>Junit</li> 
  </ul>

<h3>To run the src from dev branch</h3>

<ol>
  <li>Open node_module and download <b>chartist</b> from Dev branch.</li>
  <li>Paste <b>chartist</b> to angular project - node_module - @types.</li>
  <li>open bash, cd to root of the angular project, type :
  
  
  ```
  $ npm install @ngui/map @types/googlemaps --save
  ```
  </li>
  <li>refresh</li>
  <li>ng serve --open</li>
  </ol>
  <p>if chartist has no module found exception, cd to root angular project folder, try :
  
  ```
  $ npm install --save @types/chartist
  ```
  </p>
