import { Images } from './../../../../../../models/images/images';
import { Component, Input, OnInit,  } from '@angular/core';
import { ImagesService } from 'src/app/services';

@Component({
  selector: 'app-cards',
  templateUrl: './cards.component.html',
  styleUrls: ['./cards.component.scss']

})
export class CardsComponent implements OnInit {
  @Input() list = [
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
  },
  ]
  _images: Images[] = [
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
      imageUrlBoloTCard1: './assets/bolotradcional/slidebolot1Alt.png',
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
  },
  ];

  urlBoloTrad1:string = './assets/bolotradcional/slidebolot1Alt.png';
  urlBoloTrad2:string = './assets/bolotradcional/slidebolot12Alt.png';
  urlBoloTrad3:string = './assets/bolotradcional/slidebolot13Alt.png';

  urlBoloCob1:string = './assets/bolocobert/slidebc1alt.png';
  urlBoloCob2:string = './assets/bolocobert/slidebc2alt.png';
  urlBoloCob3:string = './assets/bolocobert/slidebc3alt.png';

  urlBoloBf1:string = './assets/bolofesta/slidebf1alt.png';
  urlBoloBf2:string = './assets/bolofesta/slidebf2alt.png';
  urlBoloBf3:string = './assets/bolofesta/slidebf3alt.png';





  @Input() valor:number = 0;

  incrementa(){
  this.valor++;
  }

  decrementa(){
   this.valor--;

  }
  constructor(private imagesService:ImagesService) {}

  ngOnInit(): void {
  }






}

