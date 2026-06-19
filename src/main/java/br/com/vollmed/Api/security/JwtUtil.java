package br.com.vollmed.Api.security;

import br.com.vollmed.Api.ApiApplication;
import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {
    
  

    // Criar o token com dados do usuario
    @Value("${jwt.secret}")
    private String secret;

    // Token duração de 24h -> millissegundos
    private static final long EXPIRACAO_MS = 1000L * 60 * 60 * 24;


    // Converter a String "secrect" em um objeto SecretKey criptografado.
    // HMAC - SHA256 => hmacShaKeyFor()
    private SecretKey getChave() {
        return Keys.hmacShaKeyFor(secret.getBytes());
    }

    // Gerar Token
    public String gerarToken(String username, String role) {
        return Jwts.builder()
                .subject(username) // Dono do token
                .claim("role", role)
                .issuedAt(new Date()) // iAt -> Registra o momento exato que o token foi criado.
                .expiration(new Date(System.currentTimeMillis() + EXPIRACAO_MS))
                .signWith(getChave())
                .compact(); // HEADER.PAYLOAD.SIGNATURA 
    }

    public boolean isTokenValido(String token, String username) {
        // Extrair o username de detro do token (campo "sub" do payload)
        String usernameDoToken = extrairUsername(token);

        // Condição 1-> o username do token deve ser igual ao username esperado.
        // Impede que um token de outro usuário seja usado no lugar.apiApplication

        // Condição 2 -> a data de expiração ainda não passou. Ambas as afirmações && precisam ser verdadeiras
        return usernameDoToken.equals(username) && !isExpirado(token);
    }

    // Método que verifica se a data de expiração registrada no token já passou.
    private boolean isExpirado(String token) {
        return extrairClaims(token).getExpiration().before(new Date());
    }









    


    // Assinar com a nossa chave secreta
    // Validar os dados recebidos

    // Um token JWT tem 3 partes por ponto:
    // HEADER.PAYLOAD.SIGNATURE

   // 1. HEADER -> Tipo do token e o algoritmo da requisição.
   // 2. PAYLOAD -> dados (claims) - aqui guardamos os dados do usuário, como nome e ROLE.
   // 3. SIGNATURE -> assinatura gerada com a chave secreta. 

}
