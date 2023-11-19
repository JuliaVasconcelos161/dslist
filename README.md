<h1>Dslist Project</h1>

<h3>Project Description</h3>
<p style="text-align:justify;">This project was developed based on "Intensivão Java Spring", provided by teacher Nélio from youtube channel
    <a href="https://www.youtube.com/@DevsuperiorJavaSpring">Devsuperior Java Spring</a>.
</p>
<p style="text-align:justify;">
    On dslist application, user can search a game by id, search a list containing all games, search a list containing all gameLists, or move game's
    position. It was implemented using Java language, and Spring Boot framework, as database was used PostgreSQL allocated on Docker's container.
    Dslist's test properties has H2Database configured, so it's possible to make local tests using this memory database
    preventing develop's database to get full of test's records.
</p>

<h3>Technologies:</h3>
<ul>
    <li>Java</li>
    <li>Spring Boot</li>
    <li>PostgreSQL</li>
    <li>Docker</li>
    <li>H2Database</li>
</ul>


<h3>Endpoints</h3>
<ul>
    <li>
        <h5>Search all games</h5>
        <p>Http Method: <code>GET</code></p>
        <p>Path:<code>/games</code></p>
        <p>Payload: none</p>
        <p>Response: List of <code>GameMinDto</code></p>
        <p>Response Example:</p>
        <pre>
            [
                {
                    "gameId": 1,
                    "title": "Mass Effect Trilogy",
                    "year": 2012,
                    "urlImg": "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/1.png",
                    "shortDescription": "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!"
                },
                {
                    "gameId": 2,
                    "title": "Red Dead Redemption 2",
                    "year": 2018,
                    "urlImg": "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/2.png",
                    "shortDescription": "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!"
                }
            ]
        </pre>
    </li>
    <li>
            <h5>Search game by gameId</h5>
            <p>Http Method: <code>GET</code></p>
            <p>Path:<code>/games/{gameId}</code></p>
            <p>Payload: none</p>
            <p>Response:<code>GameDto</code> </p>
            <p>Response Example:</p>
            <pre>
                {
                    "gameId": 1,
                    "title": "Mass Effect Trilogy",
                    "year": 2012,
                    "genre": "Role-playing (RPG), Shooter",
                    "platforms": "XBox, Playstation, PC",
                    "score": 4.8,
                    "urlImg": "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/1.png",
                    "shortDescription": "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!",
                    "longDescription": "Lorem ipsum dolor sit amet consectetur adipisicing elit. Delectus dolorum illum placeat eligendi, quis maiores veniam. Incidunt dolorum, nisi deleniti dicta odit voluptatem nam provident temporibus reprehenderit blanditiis consectetur tenetur. Dignissimos blanditiis quod corporis iste, aliquid perspiciatis architecto quasi tempore ipsam voluptates ea ad distinctio, sapiente qui, amet quidem culpa."
                }
            </pre>
        </li>
        <li>
            <h5>Search gameLists</h5>
            <p>Http Method: <code>GET</code></p>
            <p>Path:<code>/lists</code></p>
            <p>Payload: none</p>
            <p>Response: List of <code>GameListDto</code> </p>
            <p>Response example:</p>
            <pre>
                [
                    {
                        "gameListId": 1,
                        "name": "Aventura e RPG"
                    },
                    {
                        "gameListId": 2,
                        "name": "Jogos de plataforma"
                    }
                ]
            </pre>
        </li>
        <li>
            <h5>Search games by gameListId</h5>
            <p>Http Method: <code>GET</code></p>
            <p>Path:<code>/{gameListId}/games</code></p>
            <p>Payload: none</p>
            <p>Response: List of <code>GameMinDto</code> </p>
            <p>Response example:</p>
            <pre>
                [
                    {
                        "gameId": 6,
                        "title": "Super Mario World",
                        "year": 1990,
                        "urlImg": "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/6.png",
                        "shortDescription": "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!"
                    },
                    {
                        "gameId": 7,
                        "title": "Hollow Knight",
                        "year": 2017,
                        "urlImg": "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/7.png",
                        "shortDescription": "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!"
                    }
                ]
            </pre>
        </li>
        <li>
            <h5>Move game's position</h5>
            <p>Http Method: <code>POST</code></p>
            <p>Path:<code>/{gameListId}/replacement</code></p>
            <p>Payload: <code>ReplacementDto</code></p>
            <p>Payload example:</p>
            <pre>
                {
                    "sourceIndex": 3,
                    "destinationIndex": 1
                }
            </pre>
            <p>Response: none </p>
        </li>

</ul>