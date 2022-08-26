import { Images } from './../../models/images/images';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ImagesService {

  constructor() { }
}

var IMAGES: Images[] = [
  {
     
      //imagem do Banner de Bolos Tradcionais
      imageUrlOne: './src/assets/bannercadastro/bannerCadastro.png',
      //imagem do Banner de Bolos Cobertura
      imageUrltwo: './src/assets/bolocobert/slidebc1alt.png',
      //imagem do Banner de Bolos Festas
      imageUrlthree: './src/assets/bolofesta/slidebf1alt.png',
      //imagem do Banner Pagina Login
      imageUrlBannerLogin: './src/assets/bannerLogin/bannerLogin.png',
      //imagem do Card 1 Bolo Tradicional
      imageUrlBoloTCard1: './src/assets/bolotradcional/slidebolot1Alt.png',
      //imagem do Card 2 Bolo Tradicional
      imageUrlBoloTCard2: './src/assets/bolotradcional/slidebolot12Alt.png',
      //imagem do Card 3 Bolo Tradicional
      imageUrlBoloTCard3: './src/assets/bolotradcional/slidebolot13Alt.png',
      //imagem do Card 1 Bolo Cobertura
      imageUrlBoloCCard1: './src/assets/bolocobert/slidebc1alt.png',
       //imagem do Card 2 Bolo Cobertura
      imageUrlBoloCCard2: './src/assets/bolocobert/slidebc2alt.png',
       //imagem do Card 3 Bolo Cobertura
      imageUrlBoloCCard3: './src/assets/bolocobert/slidebc3alt.png',
  }

];
